package section5;

import java.util.Scanner;

public class getBucketCountClass {
public static int getBucketCount(double width, double height,double areaPerBucket,int extraBuckets) {
	if(width<=0||height<=0||areaPerBucket<=0 ||extraBuckets<0) {return -1;}
	double area=width*height;
	 if(extraBuckets * areaPerBucket>area)return 0;
	 int count=0;
	 double needed=(extraBuckets +count)*areaPerBucket;
	 while(needed<area) {
		count++;
		needed=(extraBuckets +count)*areaPerBucket;
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		System.out.println(getBucketCount(-3.4, 2.1, 1.5));
		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
		System.out.println(getBucketCount(3.4, 1.5)+"\n"+getBucketCount(3.4, 1.5)
				+"\n" +getBucketCount(3.26, 0.75));
	}
	
	public static int getBucketCount(double width, double height,double areaPerBucket) {
		return getBucketCount(width, height, areaPerBucket,0);
	}
	public static int getBucketCount(double area,double areaPerBucket) {
		return getBucketCount(1, area, areaPerBucket);
	}
}
