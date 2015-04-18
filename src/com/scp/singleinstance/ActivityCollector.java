package com.scp.singleinstance;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class ActivityCollector {
	public static List<Activity> activities = new ArrayList<Activity>();
	
	//���һ���
	public static void addActivity(Activity activity){
		activities.add(activity);
	}
	
	//���һ���
	public static void removeActivity(Activity activity){
		activities.remove(activity);
	}
	
	//�������л
	public static void finishAll(){
		for (Activity activity : activities) {
			if(!activity.isFinishing()){
				activity.finish();
			}
		}
	}
}
