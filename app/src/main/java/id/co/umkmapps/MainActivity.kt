package id.co.umkmapps
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.co.umkmapps.R

import id.co.umkmapps.model.DataItem
import id.co.umkmapps.model.ResponUser
import id.co.umkmapps.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = UserAdapter(mutableListOf())

        val rvUsers: RecyclerView = findViewById(R.id.rv_users)
        rvUsers.setHasFixedSize(true)
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.adapter = adapter

        getUser()
    }

    private fun getUser() {
        val client = ApiConfig.getApiService(this).getListUsers(page = "1")

        client.enqueue(object : Callback<ResponUser> {
            override fun onResponse(call: Call<ResponUser>, response: Response<ResponUser>) {
                if (response.isSuccessful) {
                    val dataArray = response.body()?.data as List<DataItem>

                }
            }

            override fun onFailure(call: Call<ResponUser>, t: Throwable) {
                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
                t.printStackTrace()
            }
        })
    }
}
