package uetak.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uetak.entity.Shain;
import uetak.repository.ShainRepository;

/**
 * サービス層: ビジネスロジックを実装する役割。 
 * リポジトリとの連携: ShainRepositoryを使って、
 * データベースやデータソースから社員情報を取得する。
*/
@Service
public class ShainService {
	//社員リストを取得
	public ArrayList<Shain> findAll() {
		
		//社員リポジトリのインスタンス作成
		ShainRepository shainRepository = new ShainRepository();
		
		
		
		//社員リストを取得して返す
		return shainRepository.findAll();
	}
	
}
