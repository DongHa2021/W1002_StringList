package kr.ac.kumoh.s20180134.w1002_stringlist

import android.R
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kr.ac.kumoh.s20180134.w1002_stringlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding

    private val songs = arrayOf(
        "테스형", "소주한잔", "라비앙로즈", "사랑에 연습이 있었다면", "총 맞은 것처럼",
        "테스형", "소주한잔", "화장을 고치고", "사랑에 연습이 있었다면", "총 맞은 것처럼",
        "테스형", "소주한잔", "화장을 고치고", "사랑에 연습이 있었다면", "총 맞은 것처럼",
        "테스형", "소주한잔", "화장을 고치고", "사랑에 연습이 있었다면", "총 맞은 것처럼",
        "테스형", "소주한잔", "화장을 고치고", "사랑에 연습이 있었다면", "총 맞은 것처럼",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.list.adapter = ArrayAdapter<String>(this,
            R.layout.simple_list_item_1, songs)

        view.list.setOnItemClickListener { _, _, i, _ ->
            val uri = Uri.parse("http://youtube.com/results?search_query=노래방+" + songs[i])
            val youtube = Intent(Intent.ACTION_VIEW, uri)
            startActivity(youtube)
        }
    }
}