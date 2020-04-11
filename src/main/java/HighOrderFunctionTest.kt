import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.junit.jupiter.api.Test

/**
 * Created
 * 创 建 人: @author zhouxiaolong
 * 创建日期: 2020/4/11
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述: 函数的类型有：()->Unit/ Int->String
 */
class HighOrderFunctionTest {

    @Test
    fun test() {
        val view = View()
        view.setOnClickListener {
            println("client operation")
        }

        Thread.sleep(3000)
    }
}

class View() {
    fun setOnClickListener(onClick: (View) -> Unit) {
        this.onClick = onClick
    }

    private var onClick: ((View) -> Unit)? = null

    init {
        GlobalScope.launch {
            delay(1000)
            println("view operation")
            onClick?.invoke(this@View)
        }
    }
}