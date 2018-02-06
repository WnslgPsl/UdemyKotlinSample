package com.dev_juyoung.udemykotlinsample.view.main.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev_juyoung.udemykotlinsample.R
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by juyounglee on 2018. 2. 6..
 */

class HomeFragment : Fragment(), HomeContract.View {

    private val presenter: HomePresenter by lazy {
        HomePresenter(this@HomeFragment)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater?.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.loadImage()
    }

    override fun showImage(imageName: String) {
        imageView.setImageResource(resources.getIdentifier(imageName, "drawable", context.packageName))
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }
}