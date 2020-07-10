package com.fizhu.bikeappconcept.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.fizhu.bikeappconcept.R
import com.fizhu.bikeappconcept.databinding.FragmentFavoriteBinding
import com.fizhu.bikeappconcept.utils.base.BaseFragment
import com.fizhu.bikeappconcept.viewmodels.FavoriteViewModel
import io.reactivex.disposables.CompositeDisposable
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by fizhu on 09,July,2020
 * https://github.com/Fizhu
 */
class FavoriteFragment : BaseFragment() {

    private val viewModel by viewModel<FavoriteViewModel>()
    private var binding: FragmentFavoriteBinding? = null
    private val compositeDisposable by lazy {
        CompositeDisposable()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_favorite, container, false
        )
        binding?.viewModel = this.viewModel
        return binding?.root
    }

    override fun onInit() {

    }
}