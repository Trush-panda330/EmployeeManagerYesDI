package uetak.repository;
/**
 * データベースに接続する層
 * */

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import uetak.entity.Shain;
/**
 * データベースと接続するクラス
 * 一番下
 * もっとも使われる
 * */

@Repository
public class ShainRepository {
	
	//社員リストを取得
	public ArrayList<Shain> findAll(){
		
		//社員リストの作成（初期化）
		ArrayList<Shain> shainList = new ArrayList<>();
		
		//社員１を作る
		Shain shain1 = new Shain();
		shain1.setId(101);
		shain1.setName("鈴木義信");
		shain1.setGender("男");
		shain1.setNen(2003);
		shain1.setAddress("宮城県仙台市");
		//社員リストに追加
		shainList.add(shain1);
		
		
		
		//shain2を作る
		Shain shain2 = new Shain();
		shain2.setId(102);
		shain2.setName("佐藤香織");
		shain2.setGender("女");
		shain2.setNen(2004);
		shain2.setAddress("福岡県福岡市");
		shainList.add(shain2);
		
		
		return shainList;
	}

}
