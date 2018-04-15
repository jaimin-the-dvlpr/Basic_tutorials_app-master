package com.jimmy.androidhub.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.jimmy.androidhub.Adapter.Codes_Java_Adapter;
import com.jimmy.androidhub.Model.Codes_Java_Model;
import com.jimmy.androidhub.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaimin_Patel on 2/19/2018.
 */

public class CodesFragment extends Fragment {

    ListView listView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    Toolbar toolbarcode;

    ArrayList<Object> people = new ArrayList<>();
    ArrayList<Object> filter = new ArrayList<>();
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.codes_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Codes");


        toolbarcode = getView().findViewById(R.id.toolbarcodedemo);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbarcode);
        listView = (ListView) getView().findViewById(R.id.listjava);
//         btn = (Button) getView().findViewById(R.id.searchdemodemo);

        // Android Widgets
        Codes_Java_Model textview = new Codes_Java_Model("TextView", R.drawable.textview);
        Codes_Java_Model edittext = new Codes_Java_Model("EditText", R.drawable.edittext);
        Codes_Java_Model button = new Codes_Java_Model("Button", R.drawable.button);
        Codes_Java_Model rbutton = new Codes_Java_Model("RadioButton", R.drawable.radiobutton);
        Codes_Java_Model checkbox = new Codes_Java_Model("CheckBox", R.drawable.checkbox);
        Codes_Java_Model rating = new Codes_Java_Model("RatingBar", R.drawable.ratingbar);
        Codes_Java_Model progress = new Codes_Java_Model("ProgressBar", R.drawable.progress);
        Codes_Java_Model seekbar = new Codes_Java_Model("SeekBar", R.drawable.seekbar);
        Codes_Java_Model switch1 = new Codes_Java_Model("Switch", R.drawable.switchdemo);
        Codes_Java_Model toggleButton = new Codes_Java_Model("ToggleButton", R.drawable.togglebutton);
        Codes_Java_Model spinner = new Codes_Java_Model("Spinner", R.drawable.spinner);
        Codes_Java_Model autotextview = new Codes_Java_Model("AutoComplateTextView", R.drawable.autocomplatetextview);
        Codes_Java_Model multiauto = new Codes_Java_Model("Multi AutoComplate TextView", R.drawable.multiautocomplate);
        Codes_Java_Model checkedtextview = new Codes_Java_Model("CheckedTextView", R.drawable.checkbox);


        //Android Images ANd Media
        Codes_Java_Model imagebutton = new Codes_Java_Model("ImageButton", R.drawable.imagebutton);
        Codes_Java_Model imageview = new Codes_Java_Model("ImageVIew", R.drawable.imageview);
        Codes_Java_Model videoview = new Codes_Java_Model("VideoView", R.drawable.videoview);

        //Android Date Time Picker
        Codes_Java_Model textclock = new Codes_Java_Model("TextClock", R.drawable.textclock);
        Codes_Java_Model datepicker = new Codes_Java_Model("DatePicker", R.drawable.datepicker);
        Codes_Java_Model timepicker = new Codes_Java_Model("TimePicker", R.drawable.timepicker);
        Codes_Java_Model chronometer = new Codes_Java_Model("Chronometer", R.drawable.chronometer);

        //Toast
        Codes_Java_Model simpletoast = new Codes_Java_Model("Simple Toast", R.drawable.simpletoast);
        Codes_Java_Model positiontoast = new Codes_Java_Model("Positioning Toast", R.drawable.positiontoast);
        Codes_Java_Model customtoast = new Codes_Java_Model("Custom Toast", R.drawable.customtoast);

        //container
        Codes_Java_Model listviewdemo = new Codes_Java_Model("Listview", R.drawable.listview);
        Codes_Java_Model clistview = new Codes_Java_Model("Custom Listview", R.drawable.customlistview);
        Codes_Java_Model recyclerview = new Codes_Java_Model("Recyclerview", R.drawable.recyclerview);
        Codes_Java_Model expandablelist = new Codes_Java_Model("Expandable Listview", R.drawable.expandablelistview);
        Codes_Java_Model gview = new Codes_Java_Model("Grid View", R.drawable.gridview);
        Codes_Java_Model wview = new Codes_Java_Model("Web View", R.drawable.webview);
        Codes_Java_Model searchview = new Codes_Java_Model("Search View", R.drawable.searchview);

        //menus
        Codes_Java_Model cmenu = new Codes_Java_Model("Context Menu", R.drawable.contextmenu);
        Codes_Java_Model omenu = new Codes_Java_Model("Option Menu", R.drawable.optionmenu);
        Codes_Java_Model pmenu = new Codes_Java_Model("PopUp Menu", R.drawable.popupmenu);

        //activity and fragments
        Codes_Java_Model life = new Codes_Java_Model("Activity Life Cycle", R.drawable.activitylifecycle);
        Codes_Java_Model flife = new Codes_Java_Model("Fragment Life Cycle", R.drawable.fragmentlifecycle);
        Codes_Java_Model listfrag = new Codes_Java_Model("List Fragment", R.drawable.listfragment);
        Codes_Java_Model dilogfrag = new Codes_Java_Model("Dilog Fragment", R.drawable.dialogfragment);

        //telephony manager
        Codes_Java_Model pdetail = new Codes_Java_Model("Phone Details", R.drawable.phonedetail);
        Codes_Java_Model rcontact = new Codes_Java_Model("Read Contacts", R.drawable.readcontact);
        Codes_Java_Model rsms = new Codes_Java_Model("Read SMS", R.drawable.readsms);
        Codes_Java_Model ssms = new Codes_Java_Model("Send SMS", R.drawable.sendsms);


        //wifi manager
        Codes_Java_Model wifistate = new Codes_Java_Model("Change Wifi", R.drawable.wifistates);
        Codes_Java_Model wifiinfo = new Codes_Java_Model("Wifi Info", R.drawable.wifiinfo);
        Codes_Java_Model wifilist = new Codes_Java_Model("Wifi List", R.drawable.wifilist);

        //impliment intent
        Codes_Java_Model emailintent = new Codes_Java_Model("Email", R.drawable.email);
        Codes_Java_Model mapintent = new Codes_Java_Model("Maps", R.drawable.maps);
        Codes_Java_Model pcallitent = new Codes_Java_Model("Phone Call", R.drawable.phonecall);
        Codes_Java_Model camara = new Codes_Java_Model("Camara", R.drawable.camara);

        //Explicit intent
        Codes_Java_Model aintent = new Codes_Java_Model("Activity Transfer", R.drawable.activitytransfer);
        Codes_Java_Model intentdemo = new Codes_Java_Model("Passing Value from One  to onther Activity", R.drawable.passingvalue);
        Codes_Java_Model fintent = new Codes_Java_Model("Facebook", R.drawable.facebook);
        Codes_Java_Model tintent = new Codes_Java_Model("Twitter", R.drawable.twitter);
        Codes_Java_Model wintent = new Codes_Java_Model("Whatsapp", R.drawable.whatsapp);
        Codes_Java_Model gplusintnet = new Codes_Java_Model("Google Plus", R.drawable.googleplus);

        //Animations
        Codes_Java_Model fade = new Codes_Java_Model("Fade", R.drawable.fade);
        Codes_Java_Model zoom = new Codes_Java_Model("Zoom", R.drawable.searchview);
        Codes_Java_Model rotate = new Codes_Java_Model("Rotate", R.drawable.rotate);
        Codes_Java_Model move = new Codes_Java_Model("Move", R.drawable.move);
        Codes_Java_Model slide = new Codes_Java_Model("Slide", R.drawable.slide);
        Codes_Java_Model bounce = new Codes_Java_Model("Bounce", R.drawable.bounce);
        Codes_Java_Model blink = new Codes_Java_Model("Blink", R.drawable.blink);
        Codes_Java_Model sequential = new Codes_Java_Model("Sequential", R.drawable.sequantial);
        Codes_Java_Model together = new Codes_Java_Model("Together", R.drawable.together);

        //datastorage
        Codes_Java_Model shared = new Codes_Java_Model("Shared Preference", R.drawable.sharedpreference);
        Codes_Java_Model internal = new Codes_Java_Model("Internal Storage", R.drawable.internalstorage);
        Codes_Java_Model external = new Codes_Java_Model("External Storage", R.drawable.externalstorage);

        //sqlite
        Codes_Java_Model insert = new Codes_Java_Model("SQLite insert", R.drawable.sqliteinsert);
        Codes_Java_Model read = new Codes_Java_Model("SQLite Read", R.drawable.sqliteread);
        Codes_Java_Model update = new Codes_Java_Model("SQLite Update", R.drawable.sqliteupdate);
        Codes_Java_Model delete = new Codes_Java_Model("SQLite Delete", R.drawable.sqlitedelete);

        //notifications
        Codes_Java_Model noti = new Codes_Java_Model("Notification", R.drawable.notifications);
        Codes_Java_Model innoti = new Codes_Java_Model("Inbox Notification", R.drawable.inboxnotificatgion);
        Codes_Java_Model textnoti = new Codes_Java_Model("Text Notification", R.drawable.textnotification);
        Codes_Java_Model picnoti = new Codes_Java_Model("Picture Notification", R.drawable.imagenotification);

        //xml and json
        Codes_Java_Model json = new Codes_Java_Model("JSON Parsing", R.drawable.jsonparsing);
        Codes_Java_Model xml = new Codes_Java_Model("XML Parsing", R.drawable.xmlparsing);

        // material design
        Codes_Java_Model fbutton = new Codes_Java_Model("Floating Action Button", R.drawable.floatingactionbutton);
        Codes_Java_Model sdmo = new Codes_Java_Model("SnackBar", R.drawable.snackbar);
        Codes_Java_Model bnav = new Codes_Java_Model("Bottom Navigation", R.drawable.bottomnavigation);
        Codes_Java_Model bshits = new Codes_Java_Model("Bottom Sheets", R.drawable.bottomsheets);
        Codes_Java_Model ndrawer = new Codes_Java_Model("Navigation Drawer", R.drawable.navigationdrawer);



        people.add("Android Widgets");
        people.add(textview);
        people.add(edittext);
        people.add(button);
        people.add(rbutton);
        people.add(checkbox);
        people.add(rating);
        people.add(progress);
        people.add(seekbar);
        people.add(switch1);
        people.add(toggleButton);
        people.add(spinner);
        people.add(autotextview);
        people.add(multiauto);
        people.add(checkedtextview);


        people.add("Android Images And Media");
        people.add(imagebutton);
        people.add(imageview);
        people.add(videoview);

        people.add("Android Date Time Picker");
        people.add(textclock);
        people.add(datepicker);
        people.add(timepicker);
        people.add(chronometer);

        people.add("Android Toast");
        people.add(simpletoast);
        people.add(positiontoast);
        people.add(customtoast);

        people.add("Android Container");
        people.add(listviewdemo);
        people.add(clistview);
        people.add(recyclerview);
        people.add(expandablelist);
        people.add(gview);
        people.add(wview);
        people.add(searchview);

        people.add("Android Menus");
        people.add(cmenu);
        people.add(omenu);
        people.add(pmenu);

        people.add("Android Activity and Fragments");
        people.add(life);
        people.add(flife);
        people.add(listfrag);
        people.add(dilogfrag);

        people.add("Android Telephony Manager");
        people.add(pdetail);
        people.add(rcontact);
        people.add(rsms);
        people.add(ssms);

        people.add("Android Wifi Manager");
        people.add(wifistate);
        people.add(wifiinfo);
        people.add(wifilist);


        people.add("Android Implicit Intent");
        people.add(emailintent);
        people.add(mapintent);
        people.add(pcallitent);
        people.add(camara);


        people.add("Android Explicit Intent");
        people.add(aintent);
        people.add(intentdemo);
        people.add(fintent);
        people.add(tintent);
        people.add(wintent);
        people.add(gplusintnet);

        people.add("Android Animations");
        people.add(fade);
        people.add(zoom);
        people.add(rotate);
        people.add(move);
        people.add(slide);
        people.add(bounce);
        people.add(blink);
        people.add(sequential);
        people.add(together);

        people.add("Android DatabaseStorage");
        people.add(shared);
        people.add(internal);
        people.add(external);


        people.add("Android SQLite");
        people.add(insert);
        people.add(read);
        people.add(update);
        people.add(delete);

        people.add("Android Notification");
        people.add(noti);
        people.add(innoti);
        people.add(textnoti);
        people.add(picnoti);

        people.add("Android XML And JSON ");
        people.add(json);
        people.add(xml);


        people.add("Android Material Design");
        people.add(fbutton);
        people.add(sdmo);
        people.add(bnav);
        people.add(bshits);
        people.add(ndrawer);


        listView.setAdapter(new Codes_Java_Adapter(getActivity(), people));

    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
       // inflater.inflate(R.menu.search, menu);
        super.onCreateOptionsMenu(menu, inflater);
        MenuItem item = menu.add("Search");
        item.setIcon(R.drawable.searchsearch); // sets icon
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        SearchView sv = new SearchView(getActivity());
        int id = sv.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView textView = (TextView) sv.findViewById(id);


        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
                }




            @Override
            public boolean onQueryTextChange(String newText) {
                if (newText == null || newText.trim().isEmpty()) {
                    resetSearch();
                }
                    return false;
                //return true;

//                ArrayList<Codes_Java_Model> filteredValues = new ArrayList<>();
//
//                for (Object value : filteredValues)
//                  if (!value.toString().contains(newText.toLowerCase())) {
//                 //     fi.remove(value);
//                      filteredValues.remove(value);
//                  }
//
//                listView.setAdapter(new Codes_Java_Adapter(getActivity(), people));
//
//        return false;
        }

    public void resetSearch() {
        listView.setAdapter(new Codes_Java_Adapter(getActivity(), people));
    }
        });
        item.setActionView(sv);
    }

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//
//            case R.id.searchsearch:
//
//
//
//                return false;
//            default:
//                break;
//        }
//
//        return false;
//    }

//    @Override
//    public boolean onQueryTextSubmit(String query) {
//        return false;
//    }
//
//    @Override
//    public boolean onQueryTextChange(String newText) {
//       String   text = newText;
//      //
//        // people.getFilter(text);
//        return false;
//    }








