package icepbru.monchaikaewbuadee.pbru1;

/**
 * Created by 11 on 1/19/2018.
 */

public class MyData {

    public String[] name() {

        String[] strName = new String[5];
        strName[0] = "Dora";
        strName[1] = "Hulk";
        strName[2] = "Ironman";
        strName[3] = "Picachu";
        strName[4] = "Spongebob";

        return strName;
    }


    public String[] detail() {
        String[] strDetail = new String[5];
        strDetail[0] = "เอ๊ะ! มันอยู่ที่ไหนห่ะ ?";
        strDetail[1] = "ข้าจะทำลายล้างให้หมด 555";
        strDetail[2] = "จาวิส! ได้ยินมั้ย ?";
        strDetail[3] = "ปิกก้าจู้!!!!";
        strDetail[4] = "เอ็ดเวริ์ดช่วยฉันหน่อย";

        return strDetail;
    }

    public int[] icon() {
        int[] intIcon = {R.drawable.dora, R.drawable.hulk, R.drawable.ironman, R.drawable.pikachu, R.drawable.spongebob};


        return intIcon;
    }

}//Main class
