package com.lanic.navigationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.lanic.navigationsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private val oneFragment by lazy { OneFragment() }
    private val twoFragment by lazy { TwoFragment() }
    private val threeFragment by lazy { ThreeFragment() }
    private val fourFragment by lazy { FourFragment() }
    private val fiveFragment by lazy { FiveFragment() }

    private val fragments = listOf(oneFragment, twoFragment, threeFragment, fourFragment, fiveFragment)

    private val mainAdapter by lazy { MainAdapter(this, fragments) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.vpMain.apply {
            adapter = mainAdapter
        }

        binding.bnvMain.setOnNavigationItemSelectedListener {
            val page = when (it.itemId) {
                R.id.oneFragment -> 0
                R.id.twoFragment -> 1
                R.id.threeFragment -> 2
                R.id.fourFragment -> 3
                else -> 4
            }
            binding.vpMain.currentItem = page
            true
        }
    }

    /**
     *
     * 이 방법 이외에 바텀네비게이션과 뷰페이저를 활용하는 방법이 있고,
     * 탭레이아웃과 뷰페이저를 Mediator로 연결해서 사용하는 방법이 있다.
     *
     */

    inner class MainAdapter(activity: AppCompatActivity, private val fragments: List<Fragment>) : FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = fragments.size
        override fun createFragment(position: Int): Fragment = fragments[position]
    }
}