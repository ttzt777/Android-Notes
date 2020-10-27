package cc.bear3.notes.ui.common.weight

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnClickListener
import androidx.constraintlayout.widget.ConstraintLayout
import cc.bear3.notes.R
import kotlinx.android.synthetic.main.view_title_bar.view.*

/**
 * Description:
 * Author: TT
 */
class TitleBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    var iconResId: Int = R.mipmap.ic_title_bar_back_black
        set(value) {
            field = value
            v_back.setImageResource(iconResId)
        }

    var title = ""
        set(value) {
            field = value
            v_title.text = value
        }

    var hasDivide = false
        set(value) {
            field = value
            v_divide.visibility = if (value) View.VISIBLE else View.GONE
        }

    init {
        View.inflate(context, R.layout.view_title_bar, this)

        attrs?.let {
            val array = context.obtainStyledAttributes(attrs, R.styleable.TitleBar)

            iconResId = array.getResourceId(R.styleable.TitleBar_tb_icon_res, iconResId)
            title = array.getString(R.styleable.TitleBar_tb_title) ?: ""
            hasDivide = array.getBoolean(R.styleable.TitleBar_tb_has_divide, hasDivide)

            array.recycle()
        }

        v_back.setImageResource(iconResId)
        v_title.text = title
        v_divide.visibility = if (hasDivide) View.VISIBLE else View.GONE

        setIconOnclickListener(OnClickListener {
            (context as? Activity)?.onBackPressed()
        })
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun setIconOnclickListener(listener: OnClickListener) {
        v_title_click.setOnClickListener(listener)
    }
}