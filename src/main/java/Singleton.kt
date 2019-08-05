/**
 * Created
 * 创 建 人: zhouxiaolong
 * 创建日期: 2018/11/11
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
object Singleton{

}

class SingletonLazy private constructor(){
    companion object {
        val instance: SingletonLazy by lazy(LazyThreadSafetyMode.PUBLICATION) { SingletonLazy() }
    }

    fun print(){
        println("线程安全的lazy单例")
    }
}