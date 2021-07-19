package com.example.mycryto.ui.viewmodel.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycryto.adapters.CryptoCoinAdapter
import com.example.mycryto.databinding.FragmentHomeBinding
import com.example.mycryto.ui.viewmodel.viewmodel.CryptoViewModel

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private lateinit var cryptoAdapter: CryptoCoinAdapter

    private val cryptoViewModel: CryptoViewModel by viewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })


        cryptoViewModel.onCreate()


        cryptoViewModel.cryptoModel.observe(viewLifecycleOwner , Observer {
            cryptoAdapter = CryptoCoinAdapter(it)
            binding.cryptoRv.layoutManager = LinearLayoutManager(activity)
            binding.cryptoRv.adapter = cryptoAdapter
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}