package com.example.davalebaerti
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    fun ClickBtn(view: View)
    {   var enter: EditText=findViewById(R.id.enterN)
        var result: TextView=findViewById(R.id.resultN)
        var text:String= enter.text.toString()
        result.setText(convertNumbIntoStr(text.toInt()))
    }
    fun convertNumbIntoStr(number:Int):String {

        var geoArray0 = listOf(
            "ნოლი",
            "ერთი",
            "ორი",
            "სამი",
            "ოთხი",
            "ხუთი",
            "ექვსი",
            "შვიდი",
            "რვა",
            "ცხრა",
            "ათი",
            "თერთმეტი",
            "თორმეტი",
            "ცამეტი",
            "თოთხმეტი",
            "თხუთმეტი",
            "თექვსმეტი",
            "ჩვიდმეტი",
            "თვრამეტი",
            "ცხრამეტი",
            "ოცი"
        )

        var geoArray1 = listOf(
            "ნული",
            "ათი",
            "ოცი",
            "ოცდაათი",
            "ორმოცი",
            "ორმოცდაათი",
            "სამოცი",
            "სამოცდაათი",
            "ოთხმოცი",
            "ოთხმოცდაათი"
        )
        var geoArray2 = listOf(
            "",
            "ას",
            "ორას",
            "სამას",
            "ოთხას",
            "ხუთას",
            "ექვსას",
            "შვიდას",
            "რვაას",
            "ცხრაას"
        )

        fun length2(theNumber: Int): String {
            if ((theNumber % 10)==0) return geoArray1[theNumber / 10]
            if (theNumber < 21) return geoArray0[theNumber]
            if (theNumber < 40) return " ოცდა" + "" + geoArray0[theNumber - 20]
            if (theNumber < 60) return " ორმოცდა" + "" + geoArray0[theNumber - 40]
            if (theNumber < 80) return " სამოცდა" + "" + geoArray0[theNumber - 60]
            if (theNumber < 100) return " ოთხმოცდა" + "" + geoArray0[theNumber - 80]
            return ""
        }
            fun length3(theNumber1: Int): String{
                if(theNumber1 == 1000) return "ათასი"
                if ((theNumber1%100)==0)  return (geoArray2[theNumber1/100]+""+"ი")
                else return (geoArray2[theNumber1/100]+length2(theNumber1-(theNumber1/100)*100))
        }
        return length3(number)
    }
}



