/**
 * Created
 * 创 建 人: zhouxiaolong
 * 创建日期: 2018/11/4
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
class Button : Clickable ,Focusable{
    override fun focus() {
        println("Button调用Focus方法")
    }

    override fun log() {
        super<Clickable>.log()
        super<Focusable>.log()
    }

    override fun click() {
        println("Button调用点击方法")
    }

}