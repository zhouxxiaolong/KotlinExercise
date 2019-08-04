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
        println("""扩展函数的使用：${"扩展函数".lastChar()}""")
        println(add(12, 15))
        println(max(12, 15))
        val man = Man(age, "周晓龙", "男")
        val woman = Woman(10, null)
        val person = Person(13, "性别未知")

        val girl = Person(name = "angular", age = 18,sex = "女")
        println(man)
        println(woman)
        println(person)
        println(girl)
        println(sex(man))

        println(man.adult)
        println(woman.adult)

        val people = listOf(man, woman)
        //lambda表达式
        println("年龄最大的人是---->${people.maxBy { it.age }}")
        println("年龄最大的人是---->${people.maxBy { person: Person -> person.age }}")
        println("年龄最大的人是---->${people.maxBy { person -> person.age }}")
        //用成员引用搜索
        println("年龄最小的人是---->${people.minBy(Person::age)}")
        println(Person::class.java)
        println(people.filter { it.age > 13 }.map { it.name })
        println(people.map { it.name })
        run(::print)

        val button = Button()
        button.click()
        button.focus()
        button.log()

        val a = A()
        a.listener = fun(s: String?) {
            println(s)
        }
        a.listener?.invoke("ssssssss")

        CompanionClass.testLog()
        val factoryBuildA = Factory.newA()
        val factoryBuildB = Factory.Build.newB()
        factoryBuildA.print("${factoryBuildA.javaClass}")
        factoryBuildA.print("${factoryBuildB.javaClass}")
        Impl.click()
        Extend.log("实现伴生对象的拓展函数")

        val listener = object : AbstractClass() {
            override fun callBack() {
                println("---------CallBack---------")
            }
        }
        listener.callBack()

        a()
        b()
        println(::B)
        println(alphabet())
        println(stringLength("asasdasdd"))
        println(startWithA("bsasdasdd"))

        println(SingletonLazy.instance.hashCode())
        println(SingletonLazy.instance.hashCode())
        println(SingletonLazy.instance.hashCode())
        println(SingletonLazy.instance.hashCode())
        println(toString(null))
        println(toString("123132312"))
    }

    fun a() = println("-------a---------")
    fun b() {
        println("-------b---------")
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

    private fun Extend.Companion.log(string: String) {
        println(string)
    }

    fun alphabet(): String {
        val stringBuilder = StringBuilder()
        return with(stringBuilder) {
            this.append("---with--方法使用---")
            for (letter in 'a'..'z') {
                this.append(letter)
            }
            //可以省略this
            append("-----------")
            toString()
        }
    }

    fun stringLength(s: String?): Int {
        return s?.length ?: 0
    }

    fun startWithA(s: String?): Boolean {
        val letter = s!! as? String ?: return false
        return letter.get(0).equals('a')
    }

    fun toString(s: String?): String {
        return s ?: "为空"
    }
}