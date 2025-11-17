package com.example.mis571groupproject;
import com.example.mis571groupproject.util.DBOperator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class GroupActivity extends Activity implements OnClickListener{
    Button checkoutBtn,queryBtn;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkoutBtn=(Button)this.findViewById(R.id.goCheckOut_btn);
        checkoutBtn.setOnClickListener(this);
        queryBtn=(Button)this.findViewById(R.id.goDoQuery_btn);
        queryBtn.setOnClickListener(this);
//copy database file
        try {
            DBOperator.copyDB(getBaseContext());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public void onClick(View v)
    {
        int id=v.getId();
//        if (id==R.id.goCheckOut_btn){
//            Intent intent = new Intent(this, CheckoutActivity.class);
//            this.startActivity(intent);
//        }
        if (id==R.id.goDoQuery_btn){
            Intent intent = new Intent(this, QueryActivity.class);
            this.startActivity(intent);
        }
    }
}
