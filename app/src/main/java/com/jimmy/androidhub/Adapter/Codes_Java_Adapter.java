package com.jimmy.androidhub.Adapter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jimmy.androidhub.Codes_output.Button_Codes;
import com.jimmy.androidhub.Codes_output.CheckBox_Codes;
import com.jimmy.androidhub.Codes_output.Edittext_Codes;
import com.jimmy.androidhub.Codes_output.ProgressBar_Codes;
import com.jimmy.androidhub.Codes_output.RadioButton_Codes;
import com.jimmy.androidhub.Codes_output.Ratingbar_Codes;
import com.jimmy.androidhub.Codes_output.Seekbar_Codes;
import com.jimmy.androidhub.Codes_output.Textview_Codes;
import com.jimmy.androidhub.Favourite_DataBase.DBManager;
import com.jimmy.androidhub.Model.Codes_Java_Model;
import com.jimmy.androidhub.R;
import com.jimmy.androidhub.Tab_Layout_Codes;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static android.content.ContentValues.TAG;

public class Codes_Java_Adapter extends BaseAdapter {
    private ArrayList<Object> Java_Arrary;
    TextView name;

    FloatingActionButton fabcode;
    private LayoutInflater inflater;
    private static final int Type_List_Java = 0;
    private static final int TYPE_DIVIDER = 1;
    DBManager dbO;
    String isChecked = "", namec = "";
    public Button fav;
    public String file1 = "";
    public String file2 = "";
    String ok = new String();
    String ok1 = new String();


    public Codes_Java_Adapter(FragmentActivity activity, ArrayList<Object> personArray) {
        this.Java_Arrary = personArray;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return Java_Arrary.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return Java_Arrary.get(position);
    }

    @Override
    public int getViewTypeCount() {
        // TYPE_PERSON and TYPE_DIVIDER
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (getItem(position) instanceof Codes_Java_Model) {
            return Type_List_Java;
        }

        return TYPE_DIVIDER;
    }

    @Override
    public boolean isEnabled(int position) {
        return (getItemViewType(position) == Type_List_Java);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        if (convertView == null) {
            switch (type) {
                case Type_List_Java:
                    convertView = inflater.inflate(R.layout.row_item, parent, false);
                    break;
                case TYPE_DIVIDER:
                    convertView = inflater.inflate(R.layout.listview_header_row, parent, false);
                    break;
            }
        }

        switch (type) {
            case Type_List_Java:
                Codes_Java_Model list = (Codes_Java_Model) getItem(position);
                name = (TextView) convertView.findViewById(R.id.name);
                final ImageView imaged = convertView.findViewById(R.id.imaged);
                //  fav = (Button) convertView.findViewById(R.id.favbuttondemo);
                fabcode = convertView.findViewById(R.id.fabcode);
                name.setText(list.getName());
                imaged.setImageResource(list.getImaged());


                final View finalConvertView = convertView;
                fabcode.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (position == 1) {
                            Intent intent = new Intent(finalConvertView.getContext(), Textview_Codes.class);
                            finalConvertView.getContext().startActivity(intent);
                        } else if (position == 2) {
                            Intent intent = new Intent(finalConvertView.getContext(), Edittext_Codes.class);
                            finalConvertView.getContext().startActivity(intent);
                        } else if (position == 3) {
                            Intent intent = new Intent(finalConvertView.getContext(), Button_Codes.class);
                            finalConvertView.getContext().startActivity(intent);
                        } else if (position == 4) {
                            Intent intent = new Intent(finalConvertView.getContext(), RadioButton_Codes.class);
                            finalConvertView.getContext().startActivity(intent);
                        } else if (position == 5) {
                            Intent intent = new Intent(finalConvertView.getContext(), CheckBox_Codes.class);
                            finalConvertView.getContext().startActivity(intent);
                        } else if (position == 6) {
                            Intent intent = new Intent(finalConvertView.getContext(), Ratingbar_Codes.class);
                            finalConvertView.getContext().startActivity(intent);
                        } else if (position == 7) {
                            Intent intent = new Intent(finalConvertView.getContext(), ProgressBar_Codes.class);
                            finalConvertView.getContext().startActivity(intent);
                        } else if (position == 8) {
                            Intent intent = new Intent(finalConvertView.getContext(), Seekbar_Codes.class);
                            finalConvertView.getContext().startActivity(intent);

                        } else {
                            Toast.makeText(finalConvertView.getContext(), "Good Morning", Toast.LENGTH_SHORT).show();

                        }
                    }
                });

//                dbO=new DBManager(convertView.getContext());
//                dbO.open();
//                Cursor cursor = dbO.fetch();
//
//
//              if ((cursor != null) && (cursor.getCount() > 0)){
//
//                    int cursorCount = cursor.getColumnCount();
//  //                Toast.makeText(convertView.getContext(), ""+cursorCount, Toast.LENGTH_SHORT).show();
//                            Log.d(TAG, "getView: "+cursorCount);
//
//
//                        for (int i = 0; i <cursor.getCount();i++){
//                       namec = cursor.getString(0);
//                       isChecked = cursor.getString(0);
//                      // Toast.makeText(convertView.getContext(), namec, Toast.LENGTH_SHORT).show();
//                      // Log.d(TAG, "getView: "+namec);
//
//                }
//              }
//
//              if (isChecked == "true"){
//                  fav.setBackgroundDrawable(ContextCompat.getDrawable(convertView.getContext(), R.drawable.ic_favorite));
//              } else {
//                  fav.setBackgroundDrawable(ContextCompat.getDrawable(convertView.getContext(), R.drawable.ic_fav_light));
//
//              }


                //  final String ischecked = cursor.getString(0);

                //    dbO.close();
//
//                if (ischecked == "true"){
//                    fav.setBackgroundDrawable(ContextCompat.getDrawable(convertView.getContext(), R.drawable.ic_favorite));
//
//                }else {
//                    fav.setBackgroundDrawable(ContextCompat.getDrawable(convertView.getContext(), R.drawable.ic_fav_light));
//                }


//                fav.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//
//                        if (isChecked == "true"){
//                            dbO.open();
//                            dbO.delete(name.getText().toString());
//                            dbO.close();
//                            fav.setBackgroundDrawable(ContextCompat.getDrawable(view.getContext(), R.drawable.ic_fav_light));
//                            isChecked = "false";
//                        }else{
//                            dbO.open();
//                            dbO.insert(name.getText().toString(),imaged.toString(),"true");
//                            dbO.close();
//                            fav.setBackgroundDrawable(ContextCompat.getDrawable(view.getContext(), R.drawable.ic_favorite));
//                            isChecked = "true";
//
//                        }
//
//
//
//                    }
//                });


                break;
            case TYPE_DIVIDER:
                TextView title = (TextView) convertView.findViewById(R.id.txtHeader);
                String titleString = (String) getItem(position);
                title.setText(titleString);
                break;
        }

        final View finalConvertView = convertView;
        final View finalConvertView1 = convertView;


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 1) {
                    file1 = "textview_activity.txt";
                    file2 = "textview_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "TextView");
                    intent.putExtra("image", R.drawable.textview);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    intent.putExtra("header", new String[]{"Main_Actity.kt", "activity_main.xml", "Third"});
                    intent.putExtra("count", 3);
                    view.getContext().startActivity(intent);
                } else if (position == 2) {
                    file1 = "edittext_activity.txt";
                    file2 = "edittext_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "EditText");
                    intent.putExtra("image", R.drawable.edittext);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    intent.putExtra("header", new String[]{"Main_Actity.kt", "activity_main.xml"});
                    intent.putExtra("count", 2);
                    view.getContext().startActivity(intent);
                } else if (position == 3) {
                    file1 = "button_activity.txt";
                    file2 = "button_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "Button");
                    intent.putExtra("image", R.drawable.button);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    view.getContext().startActivity(intent);
                } else if (position == 4) {
                    file1 = "radiobutton_activity.txt";
                    file2 = "radiobutton_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "RadioButton");
                    intent.putExtra("image", R.drawable.radiobutton);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    view.getContext().startActivity(intent);
                } else if (position == 5) {
                    file1 = "checkbox_activity.txt";
                    file2 = "checkbox_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "CheckdBox");
                    intent.putExtra("image", R.drawable.checkbox);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    view.getContext().startActivity(intent);
                } else if (position == 6) {
                    file1 = "ratingbar_activity.txt";
                    file2 = "ratingbar_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "RatingBar");
                    intent.putExtra("image", R.drawable.ratingbar);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    view.getContext().startActivity(intent);
                } else if (position == 7) {
                    file1 = "progressbar_activity.txt";
                    file2 = "progressbar_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "ProgressBar");
                    intent.putExtra("image", R.drawable.progressbar);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    view.getContext().startActivity(intent);

                } else if (position == 8) {
                    file1 = "seekbar_activity.txt";
                    file2 = "seekbar_main.txt";
                    loadAssets();
                    Intent intent = new Intent(view.getContext(), Tab_Layout_Codes.class);
                    intent.putExtra("name", "SeekBar");
                    intent.putExtra("image", R.drawable.seekbar);
                    intent.putExtra("activity", ok);
                    intent.putExtra("main", ok1);
                    view.getContext().startActivity(intent);

                } else {


                }
            }

            private void loadAssets() {
                try {

                    InputStream activity = finalConvertView.getContext().getAssets().open(file1);
                    InputStream main = finalConvertView.getContext().getAssets().open(file2);

                    int size = activity.available();
                    int sized = main.available();

                    byte[] buffer = new byte[size];
                    byte[] buffer1 = new byte[sized];

                    activity.read(buffer);
                    main.read(buffer1);

                    activity.close();
                    ok = new String(buffer);
                    ok1 = new String(buffer1);


                } catch (IOException ex) {
                    Toast.makeText(finalConvertView.getContext(), "Error to fetch Data", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });


        return convertView;


    }
}

