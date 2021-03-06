package Minigames.RandomWeaponWar.Weapons;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.connorlinfoot.titleapi.TitleAPI;

import Minigames.Minigame;
import Minigames.RandomWeaponWar.Weapons.CustomCooldown.CooldownType;

public class DeadDefense extends SpecialWeapon{
	
	private PotionEffect absPt = new PotionEffect(PotionEffectType.ABSORPTION, 240, 5);
	
	public DeadDefense(Minigame minigame) {
		super(minigame, Material.GOLD_INGOT, 1, (short)0, "�һ��� Ȳ�ݱ�", 12, 15); //�������ڵ�, ����, �������ڵ�, �̸�, �ּҵ�, �ִ뵩
		
		List<String> loreList = new ArrayList<String>();
				
		//���� ����
		loreList.add("��e������ �����ִ� Ȳ�ݱ��̴�.");
		loreList.add("��e����ִ� ���¿��� ü���� 20%���Ϸ� ������ ��");
		loreList.add("��e�� ������ ȸ���ϰ�");
		loreList.add("��e��� 12�ʰ� 24��ŭ�� ���� ��´�.");
		loreList.add("");
		loreList.add("��e��Ÿ�� : ��b23��");
		loreList.add("��c�޼տ� �� �ɷ� ������");
	
		setLore(loreList);
	}

	@Override
	public void onInit() {
		cooldown.clear();
	}

	@Override
	public void onRightClick(Player p) {
		
	}

	@Override
	public void onLeftClick(Player p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEntityDamaged(EntityDamageEvent e) {
		Player p = (Player) e.getEntity();
		
		
		double baseHp = p.getMaxHealth()/5;
		if(p.getHealth() - e.getDamage() <= baseHp) {//20%���Ͻ�
			if(!checkCooldown(p, CooldownType.Primary)) return;
			
			setCooldown(p, CooldownType.Primary, 23);
			p.addPotionEffect(absPt);
			TitleAPI.sendFullTitle(p, 10, 60, 10, "", "��c��lȲ�ݱ˰� ������ �����׽��ϴ�.");

			p.getWorld().playSound(p.getLocation(), Sound.BLOCK_PORTAL_AMBIENT, 1.0f, 2.0f);
		}
	}

	@Override
	public void onPlayerMove(PlayerMoveEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onHitPlayer(EntityDamageByEntityEvent e, Player damager, Player victim) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onHitted(EntityDamageByEntityEvent e, Player damager, Player victim) {
		// TODO Auto-generated method stub
		
	}
	
}