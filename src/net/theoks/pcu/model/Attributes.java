package net.theoks.pcu.model;

public class Attributes {
	private int iq, me, ma, ps, pp, pe, pb, spd, dig;

	public Attributes(int iq, int me, int ma, int ps, int pp, int pe, int pb,
			int spd, int dig) {
		this.iq = iq;
		this.me = me;
		this.ma = ma;
		this.ps = ps;
		this.pp = pp;
		this.pe = pe;
		this.pb = pb;
		this.spd = spd;
		this.dig = dig;
	}

	public Attributes() {
		this.iq = 0;
		this.me = 0;
		this.ma = 0;
		this.ps = 0;
		this.pp = 0;
		this.pe = 0;
		this.pb = 0;
		this.spd = 0;
		this.dig = 0;
	}

	public int getIq() {
		return iq;
	}

	public int getMe() {
		return me;
	}

	public int getMa() {
		return ma;
	}

	public int getPs() {
		return ps;
	}

	public int getPp() {
		return pp;
	}

	public int getPe() {
		return pe;
	}

	public int getPb() {
		return pb;
	}

	public int getSpd() {
		return spd;
	}

	public int getDig() {
		return dig;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public void setMe(int me) {
		this.me = me;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public void setPe(int pe) {
		this.pe = pe;
	}

	public void setPb(int pb) {
		this.pb = pb;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public void setDig(int dig) {
		this.dig = dig;
	}

	@Override
	public String toString() {
		return "Attributes [iq=" + iq + ", me=" + me + ", ma=" + ma + ", ps="
				+ ps + ", pp=" + pp + ", pe=" + pe + ", pb=" + pb + ", spd="
				+ spd + ", dig=" + dig + "]";
	}
}
