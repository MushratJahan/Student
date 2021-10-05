package com.example.urms.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.urms.R;

public class ProfileFragment extends Fragment {
    int id;
    TextView Name, ID, Address, Phone, Department;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_profile,container, false);



       switch (id){
           case 1001:{
               Name.setText("Tasneem Aktar");
               Name=view.findViewById(R.id.studentName);
               ID.setText("1001");
               ID=view.findViewById(R.id.studentID);
               Address.setText("Savar");
               Address=view.findViewById(R.id.studentPhone);
               Phone.setText("013567898");
               Phone=view.findViewById(R.id.studentAddress);
               Department.setText("CSE");
               Department=view.findViewById(R.id.studentDepartment);
               break;}
           case 1002:
           {
               Name.setText("TA ");
               Name=view.findViewById(R.id.studentName);
               ID.setText("1002");
               ID=view.findViewById(R.id.studentID);
               Address.setText("MDpur");
               Address=view.findViewById(R.id.studentPhone);
               Phone.setText("01987533");
               Phone=view.findViewById(R.id.studentAddress);
               Department.setText("CSE");
               Department=view.findViewById(R.id.studentDepartment);
               break;}
           case 1003:
           {
               Name.setText("T S");
               Name=view.findViewById(R.id.studentName);
               ID.setText("1003");
               ID=view.findViewById(R.id.studentID);
               Address.setText("Dhanmondi");
               Address=view.findViewById(R.id.studentPhone);
               Phone.setText("019887542");
               Phone=view.findViewById(R.id.studentAddress);
               Department.setText("CSE");
               Department=view.findViewById(R.id.studentDepartment);
               break; }
           case 1004: {
                Name.setText("T M");
                Name=view.findViewById(R.id.studentName);
                ID.setText("1004");
                ID=view.findViewById(R.id.studentID);
                Address.setText("Lalmatia");
                Address=view.findViewById(R.id.studentPhone);
                Phone.setText("013246790");
                Phone=view.findViewById(R.id.studentAddress);
               Department.setText("CSE");
               Department=view.findViewById(R.id.studentDepartment);
               break; }
           case 1005:
           {
                   Name.setText("T K");
                   Name=view.findViewById(R.id.studentName);
                   ID.setText("1005");
                   ID=view.findViewById(R.id.studentID);
                   Address.setText("Ajimpur");
                   Address=view.findViewById(R.id.studentPhone);
                   Phone.setText("0125689");
                   Phone=view.findViewById(R.id.studentAddress);
               Department.setText("CSE");
               Department=view.findViewById(R.id.studentDepartment);

               break;}
       }
    return view;
    }


}