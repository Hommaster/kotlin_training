//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import com.example.myfirstapp.R
//import com.example.myfirstapp.databinding.ActivityMainBinding
//
//class MainActivity6 : AppCompatActivity() {
//
//    lateinit var bindingClass: ActivityMainBinding
//
////    val duesArray = arrayOf(1000, 900, 700, 2100, 500)
////    val profitArray = arrayOf(2100, 700, 1100, 3300, 550)
//    var bad = 0..3
//    var normal = 4..6
//    var nice = 7..9
//    var excellent = 10
////    var resultListArray = arrayListOf<String>()
//    val badArray = arrayListOf<String>()
//    val normalArray = arrayListOf<String>()
//    val niceArray = arrayListOf<String>()
//    val excellentArray = arrayListOf<String>()
//    val gradeArray = arrayOf(3, 5, 7, 9, 4, 3, 10, 8)
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        bindingClass = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(bindingClass.root)
//
//        val name = resources.getStringArray(R.array.names)
////        for((index, name) in name.withIndex()){
////
////            resultListArray.add("Name: $name Profit: ${duesArray[index] - profitArray[index]}")
////            bindingClass.resultList.text = resultListArray.toString()
////        }
//        for((index, name) in name.withIndex()) {
//            when(gradeArray[index]) {
//                in bad -> badArray.add("Ученик $name, плохая оценка - ${gradeArray[index]}")
//                in normal -> normalArray.add("Ученик $name, нормальная оценка - ${gradeArray[index]}")
//                in nice -> niceArray.add("Ученик $name, хорошая оценка - ${gradeArray[index]}")
//                excellent -> excellentArray.add("Ученик $name, отличная оценка - ${gradeArray[index]}")
//            }
//        }
//    }
//}