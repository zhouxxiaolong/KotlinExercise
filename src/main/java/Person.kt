/**
 * Created
 * 创 建 人: zhouxiaolong
 * 创建日期: 2018/10/31
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
//如果主构造函数的所有的参数都有默认值，编译器会生成 一个额外的无参构造函数，它将使用默认值。
open class Person(age: Int, name: String?, sex: String = "未知") {
    /**
     * 必须声明属性
     */
    val age = age
    val name = name
    open val sex = sex

    override fun toString(): String {
        return """此人，姓名为：${name ?: "姓名"}，年龄：${age}，性别：${sex}"""
    }
}