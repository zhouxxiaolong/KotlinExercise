/**
 * Created
 * 创 建 人: zhouxiaolong
 * 创建日期: 2018/11/4
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
open class A : BaseClass {
    constructor()

    var listener: ((s: String) -> Unit)? = { s: String ->
        println("----callback----$s")
    }

}