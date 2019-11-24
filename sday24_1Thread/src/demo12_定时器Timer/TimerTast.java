package demo12_定时器Timer;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 需求：
 *  	在指定的时间删除我们的目录(你可以指定c盘，但我不建议，我们是用项目路径下的demo)
 *  public void schedule(TimerTask task, Date time)
 *  	安排在指定的时间执行指定的任务。
 *  public void schedule(TimerTask task, long delay, long period)
 *      安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。
 *      
 */
public class TimerTast {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();

		String s = "2019-02-27 18:04:45";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		t.schedule(new DeleteFolder(), d);
	}
}

class DeleteFolder extends TimerTask {

	@Override
	public void run() {
		File srcFolder = new File("demo");
		deleteFolder(srcFolder);
	}

	// 递归删除目录。
	private void deleteFolder(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		if (fileArray != null) {
			for (File file : fileArray) {
				if (file.isDirectory()) {
					deleteFolder(file);
				}
				System.out.println(file.getName() + ":" + file.delete());

			}
		}
	}

}