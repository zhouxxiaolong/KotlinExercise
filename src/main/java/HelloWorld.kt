import org.junit.jupiter.api.Test

/**
 * Created
 * 创 建 人: zhouxiaolong
 * 创建日期: 2018/10/31
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
class HelloWorld {

    val num1 = 16
    var age = 18

    @Test
    fun main() {
        println("---------Hello Kotlin---------")
        println(add(12, 15))
        println(max(12, 15))
        val man = Man(age, "周晓龙","男")
        val woman = Woman(0, null)
        val person = Person(13, "性别未知")
        println(man)
        println(woman)
        println(person)
        println(sex(man))

    }

    private fun add(arg1: Int, arg2: Int): String = "两数之和: ${arg1 + arg2}"

    private fun max(arg1: Int, arg2: Int): String {
        return "最大值是: ${if (arg1 > arg2) arg1 else arg2}"
    }

    private fun sex(person: Person): String =
            when (person.sex) {
                "男" -> "性别是男"
                "女" -> "性别是女"
                "", "保密" -> "性别保密"
                else -> "变态吧"
            }


}