package cc.bear3.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cc.bear3.notes.db.DbHelper
import cc.bear3.notes.db.data.GroupData
import cc.bear3.notes.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }

        DbHelper.db.appDap().insertGroup(GroupData("第一组", "我是第一组", ""))
    }
}