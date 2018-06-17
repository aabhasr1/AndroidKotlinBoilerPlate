package com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.toasty

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.aabhasjindal.arch.androidkotlinboilerplate.R
import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseFragment
import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.GitReposResponse
import dagger.android.support.AndroidSupportInjection
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.fragment_toasty_test.*
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ToastyFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ToastyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ToastyFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var toastyFragmentViewModel: ToastyFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        toastyFragmentViewModel = ViewModelProviders.of(this,viewModelFactory)
                .get(ToastyFragmentViewModel::class.java)
    }

    private fun loadData() {
        toastyFragmentViewModel.getTestData()!!.subscribe { t1, t2 ->
            if (t1!=null)
                updateTextBox(t1)
        }
        updateButtons(toastyFragmentViewModel.testDataList)
    }

    private fun updateTextBox(testDataList2: GitReposResponse?) {
        api_success.text= testDataList2!!.name
    }

    private fun updateButtons(toastDataList: MutableList<String>) {
        error_btn.text=toastDataList[0]
        info_btn.text=toastDataList[1]
        success_btn.text=toastDataList[2]
        generic_btn.text=toastDataList[3]

        setClickListeners()
    }

    private fun setClickListeners() {
        error_btn.setOnClickListener {
            Toasty.error(activity as Context,"This is a error message", Toast.LENGTH_SHORT,true).show()
        }
        info_btn.setOnClickListener {
            Toasty.info(activity as Context,"This is a info message", Toast.LENGTH_SHORT,true).show()
        }
        success_btn.setOnClickListener {
            Toasty.success(activity as Context,"This is a success message", Toast.LENGTH_SHORT,true).show()
        }
        generic_btn.setOnClickListener {
            Toasty.warning(activity as Context,"This is a warning message", Toast.LENGTH_SHORT,true).show()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_toasty_test, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        AndroidSupportInjection.inject(this)
        loadData()
    }
}
