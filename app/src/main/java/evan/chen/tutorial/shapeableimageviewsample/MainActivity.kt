package evan.chen.tutorial.shapeableimageviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.shape.CornerFamily
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val radius = 50.0f
//        imageView.shapeAppearanceModel = imageView.shapeAppearanceModel
//            .toBuilder()
//            .setTopRightCorner(CornerFamily.ROUNDED, radius)
//            .setBottomLeftCorner(CornerFamily.ROUNDED, radius)
//            .build()

    }
}
