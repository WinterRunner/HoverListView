package com.example.admin.hoverlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HoverListView extends Activity {

    private ListView listView;
    private TextView tv_hover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hover_list_view);
        String[] str = {"aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc", "cccccccccc", "aaaaaaaaa", "bbbbbbbbbbb", "cccccccccc"};

        tv_hover = (TextView) findViewById(R.id.tv_hover);//隐藏的悬停项
        listView = (ListView) findViewById(R.id.listview);

        //给listview添加三个头
        View view1 = View.inflate(this, R.layout.head1, null);
        View view2 = View.inflate(this, R.layout.head2, null);
        View view3 = View.inflate(this,R.layout.head3,null);
        listView.addHeaderView(view1);
        listView.addHeaderView(view2);
        listView.addHeaderView(view3);//悬停项.positon为2

        //设置适配器
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str));

        //设置滚动监听
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if(firstVisibleItem>=2&&tv_hover.getVisibility()==View.INVISIBLE){
                    //可见
                    tv_hover.setVisibility(View.VISIBLE);
                }else if (firstVisibleItem<2&&tv_hover.getVisibility()==View.VISIBLE){
                    tv_hover.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
