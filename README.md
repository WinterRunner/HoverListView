# HoverListView
简单的悬停listview

1.在listview所在布局中,提前布局好一个要悬停的view,设置为invisible.将listview和悬停view放到一个relativewLayout中.

2.在listview的item中或者头中,添加一个和悬停view一模一样的view.

3.监听listview的滚动事件,当firstVisibleItem可见的item,为需要悬停的view时,这时控制和listview在一个布局中提前布局好的view显示出来visible.
  否则隐藏起来.

4.以上就达到了,某个item滑动到顶部时,实现了悬停的效果.

5.具体实现代码,看代码吧.我这里是添加到的头里面,添加到item里面的情况是一样的.
(开发环境,android studio)
