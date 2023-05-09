package sg.edu.rp.c346.id22012027.billpleasel3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView Amount;
    EditText AmountText;
    TextView NumOfPax;
    EditText NumOfPaxText;
    ToggleButton NOSVS;
    ToggleButton GST;
    TextView Discount;
    EditText DiscountText;
    RadioGroup RadioGroupPayment;
    Button SPLIT;
    Button RESET;
    TextView TotalBill;
    TextView EachPays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Amount=findViewById(R.id.Amount);
        AmountText=findViewById(R.id.AmountText);
        NumOfPax=findViewById(R.id.NumOfPax);
        NumOfPaxText=findViewById(R.id.NumOfPaxText);
        NOSVS=findViewById(R.id.NOSVS);
        GST=findViewById(R.id.GST);
        Discount=findViewById(R.id.Discount);
        DiscountText=findViewById(R.id.DiscountText);
        RadioGroupPayment= findViewById(R.id.RadioGroupPayment);
        SPLIT= findViewById(R.id.SPLIT);
        RESET= findViewById(R.id.RESET);
        TotalBill=findViewById(R.id.TotalBill);
        EachPays=findViewById(R.id.EachPays);
    }
}