package sub3;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WeatherCountMapper extends Mapper<LongWritable, Text, Text, DoubleWritable> {
	
	@Override
	protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	
		String line = value.toString();
		String[] tokens = line.split(",");
		
		try {
			String region = tokens[0];
			double temp = Double.parseDouble(tokens[2]);
			
			context.write(new Text(region), new DoubleWritable(temp));
		}catch (Exception e) {
			return;
		}
	}	
}
