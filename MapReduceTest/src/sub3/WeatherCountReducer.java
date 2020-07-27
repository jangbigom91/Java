package sub3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WeatherCountReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable> {
	
	private List<Double> tempList = new ArrayList<>(); 
	
	@Override
	protected void reduce(Text key, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException {
	
		double temp = 0;
		
		for(DoubleWritable val : values) {
			temp = val.get();
		}
		
		tempList.add(temp);
		
		
		DoubleWritable result = new DoubleWritable(temp);
		context.write(key, result);
	}
	
	@Override
	protected void cleanup(Context context) throws IOException, InterruptedException {
		// 마지막 리듀스 작업 후 한번 실행하는 메서드
		double total = 0;
		int size = tempList.size();
		
		for(double temp : tempList) {
			total += temp;
		}
		
		double avg = total / size;
		context.write(new Text("총 : "+size+"건"), null);
		context.write(new Text("전국 평균 온도 : "+avg+"도"), null);
	}
}
