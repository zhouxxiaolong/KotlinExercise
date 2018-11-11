/**
 * Created
 * 创 建 人: zhouxiaolong
 * 创建日期: 2018/11/11
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
class CompanionClass constructor(val name: String) {

    companion object {
        fun testLog() {
            println("伴生对象(静态方法)")
        }
    }

}

class Factory {
    companion object Build{
        fun newA() = A()
        fun newB() = B()
    }
}

class Impl{
    companion object :Clickable{
        override fun click() {
            println("伴生对象实现接口")
        }

    }
}

class Extend{
    companion object {

    }
}