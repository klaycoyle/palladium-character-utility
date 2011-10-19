package net.theoks.pcu.model.xml;

import java.util.ArrayList;
import java.util.List;

import net.theoks.pcu.model.DieRoll;
import net.theoks.pcu.model.Race;

public class XmlRace {
	public class Occ {
		private String priority = null, special = null, category = null,
				className = null, allowed = null, rcc = null;

		public String getPriority() {
			return priority;
		}

		public String getSpecial() {
			return special;
		}

		public String getCategory() {
			return category;
		}

		public String getClassName() {
			return className;
		}

		public String getAllowed() {
			return allowed;
		}

		public String getRcc() {
			return rcc;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public void setSpecial(String special) {
			this.special = special;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public void setAllowed(String allowed) {
			this.allowed = allowed;
		}

		public void setRcc(String rcc) {
			this.rcc = rcc;
		}

		@Override
		public String toString() {
			String s = "Occ [priority=" + priority;
			if (special != null)
				s += ", special=" + special;
			else if (category != null)
				s += ", category=" + category;
			else if (className != null)
				s += ", className=" + className;
			else if (rcc != null)
				s += ", rcc=" + rcc;
			s += ", allowed=" + allowed + "]";
			return s;
		}

	}

	public class Combat {
		public class NaturalAttack {
			private String name, damage, strengthBonus;

			public String getName() {
				return name;
			}

			public String getDamage() {
				return damage;
			}

			public String getStrengthBonus() {
				return strengthBonus;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setDamage(String damage) {
				this.damage = damage;
			}

			public void setStrengthBonus(String strengthBonus) {
				this.strengthBonus = strengthBonus;
			}

			@Override
			public String toString() {
				return "NaturalAttack [name=" + name + ", damage=" + damage
						+ ", strengthBonus=" + strengthBonus + "]";
			}

		}

		private String initiative, attacks, dodge, parry, roll;
		private List<NaturalAttack> naturalAttacks;

		public String getInitiative() {
			return initiative;
		}

		public String getAttacks() {
			return attacks;
		}

		public String getDodge() {
			return dodge;
		}

		public String getParry() {
			return parry;
		}

		public String getRoll() {
			return roll;
		}

		public List<NaturalAttack> getNaturalAttacks() {
			return naturalAttacks;
		}

		public void setInitiative(String initiative) {
			this.initiative = initiative;
		}

		public void setAttacks(String attacks) {
			this.attacks = attacks;
		}

		public void setDodge(String dodge) {
			this.dodge = dodge;
		}

		public void setParry(String parry) {
			this.parry = parry;
		}

		public void setRoll(String roll) {
			this.roll = roll;
		}

		public void setNaturalAttacks(List<NaturalAttack> naturalAttacks) {
			this.naturalAttacks = naturalAttacks;
		}

		@Override
		public String toString() {
			return "Combat [initiative=" + initiative + ", attacks=" + attacks
					+ ", dodge=" + dodge + ", parry=" + parry + ", roll="
					+ roll + ", naturalAttacks=" + naturalAttacks + "]";
		}

	}

	public class SkillBonus {
		private String value, skillCategories, skills;

		public String getValue() {
			return value;
		}

		public String getSkillCategories() {
			return skillCategories;
		}

		public String getSkills() {
			return skills;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public void setSkillCategories(String skillCategories) {
			this.skillCategories = skillCategories;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}

		@Override
		public String toString() {
			return "SkillBonus [value=" + value + ", skillCategories="
					+ skillCategories + ", skills=" + skills + "]";
		}

	}

	public class AutomaticSkill {
		private String name, bonus;

		public String getName() {
			return name;
		}

		public String getBonus() {
			return bonus;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setBonus(String bonus) {
			this.bonus = bonus;
		}

		@Override
		public String toString() {
			return "AutomaticSkill [name=" + name + ", bonus=" + bonus + "]";
		}

	}

	public class SaveModifier {
		private String type, save;

		public String getType() {
			return type;
		}

		public String getSave() {
			return save;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setSave(String save) {
			this.save = save;
		}

		@Override
		public String toString() {
			return "SaveModifier [type=" + type + ", save=" + save + "]";
		}

	}

	private String name, psionics, ppe, sdc, iq, me, ma, ps, pp, pe, pb, spd,
			diggingSpd, nightvision, dayvision, horrorFactor, giant;
	private List<Occ> occs;
	private List<SkillBonus> bonuses;
	private List<AutomaticSkill> skills;
	private List<SaveModifier> saves;
	private Combat combat;

	public XmlRace(String name, String psionics, String ppe, String sdc,
			String iq, String me, String ma, String ps, String pp, String pe,
			String pb, String spd, String diggingSpd, String nightvision,
			String dayvision, String horrorFactory, String giant,
			List<Occ> occs, List<SkillBonus> bonuses,
			List<AutomaticSkill> skills, List<SaveModifier> saves, Combat combat) {
		super();
		this.name = name;
		this.psionics = psionics;
		this.ppe = ppe;
		this.sdc = sdc;
		this.iq = iq;
		this.me = me;
		this.ma = ma;
		this.ps = ps;
		this.pp = pp;
		this.pe = pe;
		this.pb = pb;
		this.spd = spd;
		this.diggingSpd = diggingSpd;
		this.nightvision = nightvision;
		this.dayvision = dayvision;
		this.horrorFactor = horrorFactory;
		this.giant = giant;
		this.occs = occs;
		this.bonuses = bonuses;
		this.skills = skills;
		this.saves = saves;
		this.combat = combat;
	}

	public XmlRace() {
		super();
		this.name = "";
		this.psionics = "false";
		this.ppe = "0d0";
		this.sdc = "0";
		this.iq = "0d0";
		this.me = "0d0";
		this.ma = "0d0";
		this.ps = "0d0";
		this.pp = "0d0";
		this.pe = "0d0";
		this.pb = "0d0";
		this.spd = "0d0";
		this.diggingSpd = "0d0";
		this.nightvision = "-1";
		this.dayvision = "-1";
		this.horrorFactor = "-1";
		this.giant = "false";
		this.occs = new ArrayList<Occ>(1);
		this.bonuses = new ArrayList<SkillBonus>(1);
		this.skills = new ArrayList<AutomaticSkill>(1);
		this.saves = new ArrayList<SaveModifier>(1);
		this.combat = new Combat();
	}

	public Race generateRace() {
		Race r = new Race();
		r.setRaceName(this.name);
		r.setPsionics(Boolean.parseBoolean(this.psionics));
		r.setPpe(DieRoll.parseDieRoll(this.ppe));
		r.setSdc(Integer.parseInt(this.sdc));
		r.setIq(DieRoll.parseDieRoll(this.iq));
		r.setMe(DieRoll.parseDieRoll(this.me));
		r.setMa(DieRoll.parseDieRoll(this.me));
		r.setPs(DieRoll.parseDieRoll(this.ps));
		r.setPp(DieRoll.parseDieRoll(this.pp));
		r.setPe(DieRoll.parseDieRoll(this.pe));
		r.setPb(DieRoll.parseDieRoll(this.pb));
		r.setSpd(DieRoll.parseDieRoll(this.spd));
		r.setDiggingSpd(DieRoll.parseDieRoll(diggingSpd));
		r.setNightvision(Integer.parseInt(this.nightvision));
		r.setDayvision(Integer.parseInt(this.dayvision));
		r.setHorrorFactor(Integer.parseInt(this.horrorFactor));
		r.setGiant(Boolean.parseBoolean(this.giant));
		// TODO the complicated stuff
		return r;
	}

	public String getName() {
		return name;
	}

	public String getPsionics() {
		return psionics;
	}

	public String getPpe() {
		return ppe;
	}

	public String getSdc() {
		return sdc;
	}

	public String getIq() {
		return iq;
	}

	public String getMe() {
		return me;
	}

	public String getMa() {
		return ma;
	}

	public String getPs() {
		return ps;
	}

	public String getPp() {
		return pp;
	}

	public String getPe() {
		return pe;
	}

	public String getPb() {
		return pb;
	}

	public String getSpd() {
		return spd;
	}

	public String getDiggingSpd() {
		return diggingSpd;
	}

	public String getNightvision() {
		return nightvision;
	}

	public String getDayvision() {
		return dayvision;
	}

	public String getHorrorFactor() {
		return horrorFactor;
	}

	public String getGiant() {
		return giant;
	}

	public List<Occ> getOccs() {
		return occs;
	}

	public List<SkillBonus> getBonuses() {
		return bonuses;
	}

	public List<AutomaticSkill> getSkills() {
		return skills;
	}

	public List<SaveModifier> getSaves() {
		return saves;
	}

	public Combat getCombat() {
		return combat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPsionics(String psionics) {
		this.psionics = psionics;
	}

	public void setPpe(String ppe) {
		this.ppe = ppe;
	}

	public void setSdc(String sdc) {
		this.sdc = sdc;
	}

	public void setIq(String iq) {
		this.iq = iq;
	}

	public void setMe(String me) {
		this.me = me;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public void setPp(String pp) {
		this.pp = pp;
	}

	public void setPe(String pe) {
		this.pe = pe;
	}

	public void setPb(String pb) {
		this.pb = pb;
	}

	public void setSpd(String spd) {
		this.spd = spd;
	}

	public void setDiggingSpd(String diggingSpd) {
		this.diggingSpd = diggingSpd;
	}

	public void setNightvision(String nightvision) {
		this.nightvision = nightvision;
	}

	public void setDayvision(String dayvision) {
		this.dayvision = dayvision;
	}

	public void setHorrorFactor(String horrorFactor) {
		this.horrorFactor = horrorFactor;
	}

	public void setGiant(String giant) {
		this.giant = giant;
	}

	public void setOccs(List<Occ> occs) {
		this.occs = occs;
	}

	public void setBonuses(List<SkillBonus> bonuses) {
		this.bonuses = bonuses;
	}

	public void setSkills(List<AutomaticSkill> skills) {
		this.skills = skills;
	}

	public void setSaves(List<SaveModifier> saves) {
		this.saves = saves;
	}

	public void setCombat(Combat combat) {
		this.combat = combat;
	}

	@Override
	public String toString() {
		return "XmlRace [name=" + name + ", psionics=" + psionics + ", ppe="
				+ ppe + ", sdc=" + sdc + ", iq=" + iq + ", me=" + me + ", ma="
				+ ma + ", ps=" + ps + ", pp=" + pp + ", pe=" + pe + ", pb="
				+ pb + ", spd=" + spd + ", diggingSpd=" + diggingSpd
				+ ", nightvision=" + nightvision + ", dayvision=" + dayvision
				+ ", horrorFactor=" + horrorFactor + ", giant=" + giant
				+ ", occs=" + occs + ", bonuses=" + bonuses + ", skills="
				+ skills + ", saves=" + saves + ", combat=" + combat + "]";
	}
}
