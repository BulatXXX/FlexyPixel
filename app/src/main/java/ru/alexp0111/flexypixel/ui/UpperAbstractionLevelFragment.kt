package ru.alexp0111.flexypixel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.alexp0111.flexypixel.R
import ru.alexp0111.flexypixel.databinding.FragmentUpperAbstractionLevelBinding


class UpperAbstractionLevelFragment : Fragment() {

    private var _binding: FragmentUpperAbstractionLevelBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater , container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUpperAbstractionLevelBinding.inflate(inflater,container,false)
        return (binding.root)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}