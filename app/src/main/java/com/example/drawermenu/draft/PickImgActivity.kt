package com.example.drawermenu.draft

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.core.net.toUri
import com.example.drawermenu.R
import java.io.FileNotFoundException
import java.io.InputStream

class PickImgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_img)

        var btn: Button = findViewById(R.id.button)

        btn.setOnClickListener {
            var i: Intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(i, 1)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var img: ImageView = findViewById(R.id.imageView)

        if (resultCode == RESULT_OK && data != null) {
            var selectedImg: Uri? = data.data
//            img.setImageURI(selectedImg)

            var string = ""
            if (selectedImg != null) {
                string = selectedImg.toString()
                var uri: Uri = string.toUri()
                img.setImageURI(uri)
            }



//            try {
//                var inputStream: InputStream? = selectedImg?.let {
//                    contentResolver.openInputStream(
//                        it
//                    )
//                }
//            } catch (e: FileNotFoundException) {
//                e.printStackTrace()
//            }
        }
    }
}