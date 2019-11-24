package demo12_��ʱ��Timer;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ����
 *  	��ָ����ʱ��ɾ�����ǵ�Ŀ¼(�����ָ��c�̣����Ҳ����飬����������Ŀ·���µ�demo)
 *  public void schedule(TimerTask task, Date time)
 *  	������ָ����ʱ��ִ��ָ��������
 *  public void schedule(TimerTask task, long delay, long period)
 *      ����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
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

	// �ݹ�ɾ��Ŀ¼��
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