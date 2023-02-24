package jp.co.internous.bravo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import jp.co.internous.bravo.model.domain.TblCart;
import jp.co.internous.bravo.model.domain.dto.CartDto;
import jp.co.internous.bravo.model.form.CartForm;
import jp.co.internous.bravo.model.mapper.TblCartMapper;
import jp.co.internous.bravo.model.session.LoginSession;



/**
 * カート情報に関する処理のコントローラー
 * @author インターノウス
 *
 */
@Controller
@RequestMapping("/bravo/cart")
public class CartController {

	@Autowired
	private TblCartMapper cartMapper;

	@Autowired
	private LoginSession loginSession;

	private Gson gson = new Gson();

	/**
	 * カート画面を初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return カート画面
	 */
	@RequestMapping("/")
	public String index(Model m) {
		// ユーザーIDを取得
		int userId = loginSession.isLogined() ? loginSession.getUserId() : loginSession.getTmpUserId();

		// カート情報を取得
		List<CartDto> carts = cartMapper.findByUserId(userId);

		// page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession", loginSession);
		m.addAttribute("carts", carts);
		
		return "cart";
	}

	/**
	 * カートに追加処理を行う
	 * @param f カート情報のForm
	 * @param m 画面表示用オブジェクト
	 * @return カート画面
	 */
	@RequestMapping("/add")
	public String addCart(CartForm f, Model m) {

		// ユーザーIDを取得
		int userId = loginSession.isLogined() ? loginSession.getUserId() : loginSession.getTmpUserId();

		// カートテーブルに挿入/更新
		TblCart cart = new TblCart(f);
		
		if(loginSession.isLogined()) {
			f.setUserId(loginSession.getUserId());
			cart.setUserId(loginSession.getUserId());
			} else {
			f.setUserId(loginSession.getTmpUserId());
			cart.setUserId(loginSession.getTmpUserId());
			}
		
		int result = 0;
		//cartテーブルに一致するuserId&productIdが１件以上ある場合はupdateを呼び出し、そうでない場合はinsertを行う。
		if (cartMapper.findCountByUserIdAndProuductId(userId, f.getProductId()) > 0) {
			result = cartMapper.update(cart);
		} else {
			result = cartMapper.insert(cart);
		}
		if (result > 0) {
			List<CartDto> carts = cartMapper.findByUserId(userId);
			// page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
			m.addAttribute("loginSession", loginSession);
			m.addAttribute("carts", carts);
		}
		
		return "cart";
	}

	/**
	 * カート情報を削除する
	 * @param checkedIdList 選択したカート情報のIDリスト
	 * @return true:削除成功、false:削除失敗
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/delete")
	@ResponseBody
	public boolean deleteCart(@RequestBody String checkedIdList) {
		int result = 0;

		Map<String, List<Integer>> map = gson.fromJson(checkedIdList, Map.class);
		List<Integer> checkedIds = map.get("checkedIdList");
		
		result = cartMapper.deleteById(checkedIds);
		
		return result > 0;
	}
}
