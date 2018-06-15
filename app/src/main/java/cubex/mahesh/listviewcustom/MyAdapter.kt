package cubex.mahesh.listviewcustom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import java.io.File

class MyAdapter:BaseAdapter
{
    var path:String? = null
    var files:Array<File>? = null
    var file:File? = null
    var inflater:LayoutInflater? =null

    constructor( activity: MainActivity ){
        path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Images/"
        file = File(path)
        if(!file!!.exists()){
            path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Images/"
            file = File(path)
        }
files = file?.listFiles()
 inflater = LayoutInflater.from(activity)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var v = inflater!!.inflate(R.layout.indiview,null)

        return  v
    }

    override fun getItem(position: Int): Any {
       return 0
   }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return  files!!.size
    }

}