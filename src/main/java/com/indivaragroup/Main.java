package com.indivaragroup;
import com.indivaragroup.movie.FavoriteVideo;
import com.indivaragroup.type.data.array.TypeDataArray;
import com.indivaragroup.regristation.id.Balance;
import com.indivaragroup.student.score.StudentScore;
import com.indivaragroup.data.number.convertion.KonversiTipeDataNumber;
import com.indivaragroup.primitive.PrimitiveData;
import com.indivaragroup.house.floor.logic.CeramicCheck;


public class Main {
    static void main(String[] args) {
        //house floor ceramic
        //regristration personal id
        //scoring student
        //narowing
        //primitive data
        //typedata array
        //favorite list video AV

        System.out.println("nomor 1 --------------");
        CeramicCheck program = new CeramicCheck();
        program.checkCeramic();
        System.out.println("nomor 2 --------------");
        Balance program2 = new Balance();
        program2.getMoney();
        System.out.println("nomor 3 --------------");
        StudentScore program3 = new StudentScore();
        program3.getScore();
        System.out.println("nomor 4 --------------");
        KonversiTipeDataNumber program4 = new KonversiTipeDataNumber();
        program4.getTipeData();
        System.out.println("nomor 5 --------------");
        PrimitiveData program5 = new PrimitiveData();
        program5.getPrimitive();
        System.out.println("nomor 6 --------------");
        TypeDataArray program6 = new TypeDataArray();
        program6.getTypeDataArray();
        System.out.println("nomor 7 --------------");
        FavoriteVideo program7 = new FavoriteVideo();
        program7.getMovies();

    }
}
