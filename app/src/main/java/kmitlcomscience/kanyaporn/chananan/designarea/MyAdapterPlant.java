package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by User on 14/2/2559.
 */
public class MyAdapterPlant extends BaseAdapter {
    private Context objContext; //การรต่อท่อ


    private String[] planNameStrings;

    public MyAdapterPlant(Context objContext,String[] planNameStrings) {

        this.objContext = objContext;
        ;
        this.planNameStrings = planNameStrings;

    }

   public int getCount() {
        return planNameStrings.length;
        //return 0;
    }

    public Object getItem(int position) {
       return null;
        //return planNameStrings.length;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.list_plant,parent,false);


        TextView userTextView = (TextView) objView1.findViewById(R.id.txtName);
        userTextView.setText(planNameStrings[position]);

       // userTextView.setText(planNameStrings[position]+ " : " + position);

        return objView1;
    }
}