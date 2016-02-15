package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by User on 13/2/2559.
 */
public class MyAdapterProfit extends BaseAdapter {
    private Context objContext; //การรต่อท่อ
    private String[] bigAreaString;
    private String[] userString;

    public MyAdapterProfit(Context objContext, String[] userString) {
        this.objContext = objContext;
        this.userString = userString;

    }

    public int getCount() {
        return userString.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.list_profit,parent,false);



        TextView userTextView = (TextView) objView1.findViewById(R.id.txtName);
        userTextView.setText("User : " + userString[position]);



        return objView1;
    }
}