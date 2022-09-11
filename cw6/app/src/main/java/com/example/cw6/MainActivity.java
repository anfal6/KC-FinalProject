package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ArrayList<Student> studentArrayList =new ArrayList<>();
     int currentStudent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView studentName = findViewById(R.id.textView1);
        TextView studentAge = findViewById(R.id.textView2);
        TextView studentGrade = findViewById(R.id.textView3);
        Button nextStudent = findViewById(R.id.button);
        ImageView studentPhoto = findViewById(R.id.imageView);

        Student student1 = new Student("yousef",14,R.drawable.boy1,12);
        Student student2 = new Student("salman",13,R.drawable.boy2,10);
        Student student3 = new Student("maged",15,R.drawable.boy3,11);


        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        studentPhoto.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
         studentName.setText(studentArrayList.get(currentStudent).getStudentName());
         studentAge.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
         studentGrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

         nextStudent.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view){
              currentStudent++;
                 studentPhoto.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
                 studentName.setText(studentArrayList.get(currentStudent).getStudentName());
                 studentAge.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                 studentGrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

             }
         });
    }
}