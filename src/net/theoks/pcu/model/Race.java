package net.theoks.pcu.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {
	private String raceName;
	private DieRoll ppe, iq, me, ma, ps, pp, pe, pb, spd, diggingSpd = null;

	private int dayvision = 105600, horrorFactor = 0, sdc = 0, nightvision = 0;
	private boolean giant = false, psionics;

	private List<Occ> occs;
	private Map<Skill, Integer> skillBonuses;
	private Map<Skill, Integer> automaticSkills;
	private CombatModifiers combat;

	public Race() {
		this.raceName = null;
		this.ppe = null;
		this.iq = null;
		this.me = null;
		this.ma = null;
		this.ps = null;
		this.pp = null;
		this.pe = null;
		this.pb = null;
		this.spd = null;
		this.diggingSpd = null;
		this.psionics = false;
		this.occs = new ArrayList<Occ>();
		this.skillBonuses = new HashMap<Skill, Integer>();
		this.automaticSkills = new HashMap<Skill, Integer>();
		this.combat = new CombatModifiers();
	}

	public String getRaceName() {
		return raceName;
	}

	public DieRoll getPpe() {
		return ppe;
	}

	public DieRoll getIq() {
		return iq;
	}

	public DieRoll getMe() {
		return me;
	}

	public DieRoll getMa() {
		return ma;
	}

	public DieRoll getPs() {
		return ps;
	}

	public DieRoll getPp() {
		return pp;
	}

	public DieRoll getPe() {
		return pe;
	}

	public DieRoll getPb() {
		return pb;
	}

	public DieRoll getSpd() {
		return spd;
	}

	public DieRoll getDiggingSpd() {
		return diggingSpd;
	}

	public int getDayvision() {
		return dayvision;
	}

	public int getHorrorFactor() {
		return horrorFactor;
	}

	public int getSdc() {
		return sdc;
	}

	public int getNightvision() {
		return nightvision;
	}

	public boolean isGiant() {
		return giant;
	}

	public boolean isPsionics() {
		return psionics;
	}

	public List<Occ> getOccs() {
		return occs;
	}

	public Map<Skill, Integer> getSkillBonuses() {
		return skillBonuses;
	}

	public Map<Skill, Integer> getAutomaticSkills() {
		return automaticSkills;
	}

	public CombatModifiers getCombat() {
		return combat;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public void setPpe(DieRoll ppe) {
		this.ppe = ppe;
	}

	public void setIq(DieRoll iq) {
		this.iq = iq;
	}

	public void setMe(DieRoll me) {
		this.me = me;
	}

	public void setMa(DieRoll ma) {
		this.ma = ma;
	}

	public void setPs(DieRoll ps) {
		this.ps = ps;
	}

	public void setPp(DieRoll pp) {
		this.pp = pp;
	}

	public void setPe(DieRoll pe) {
		this.pe = pe;
	}

	public void setPb(DieRoll pb) {
		this.pb = pb;
	}

	public void setSpd(DieRoll spd) {
		this.spd = spd;
	}

	public void setDiggingSpd(DieRoll diggingSpd) {
		this.diggingSpd = diggingSpd;
	}

	public void setDayvision(int dayvision) {
		this.dayvision = dayvision;
	}

	public void setHorrorFactor(int horrorFactor) {
		this.horrorFactor = horrorFactor;
	}

	public void setSdc(int sdc) {
		this.sdc = sdc;
	}

	public void setNightvision(int nightvision) {
		this.nightvision = nightvision;
	}

	public void setGiant(boolean giant) {
		this.giant = giant;
	}

	public void setPsionics(boolean psionics) {
		this.psionics = psionics;
	}

	public void setOccs(List<Occ> occs) {
		this.occs = occs;
	}

	public void setSkillBonuses(Map<Skill, Integer> skillBonuses) {
		this.skillBonuses = skillBonuses;
	}

	public void setAutomaticSkills(Map<Skill, Integer> automaticSkills) {
		this.automaticSkills = automaticSkills;
	}

	public void setCombat(CombatModifiers combat) {
		this.combat = combat;
	}

	@Override
	public String toString() {
		return "\nRace [raceName=" + raceName + ", ppe=" + ppe + ", iq=" + iq
				+ ", me=" + me + ", ma=" + ma + ", ps=" + ps + ", pp=" + pp
				+ ", pe=" + pe + ", pb=" + pb + ", spd=" + spd
				+ ", diggingSpd=" + diggingSpd + ", dayvision=" + dayvision
				+ ", horrorFactor=" + horrorFactor + ", sdc=" + sdc
				+ ", nightvision=" + nightvision + ", giant=" + giant
				+ ", psionics=" + psionics + ", occs=" + occs
				+ ", skillBonuses=" + skillBonuses + ", automaticSkills="
				+ automaticSkills + ", combat=" + combat + "]";
	}
}
