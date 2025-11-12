package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggstabell;
    private int nesteledig;

	public Blogg() {
        innleggstabell = new Innlegg[20];
        nesteledig = 0;
    }
	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
        nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
        return innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for(int i = 0; i < nesteledig; i++) {
            if(innleggstabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for(int i = 0; i < nesteledig; i++) {
            if(innleggstabell[i].getId() == innlegg.getId()) {
                return true;
            }
        }
        return false;
	}

	public boolean ledigPlass() {
            if(nesteledig >= innleggstabell.length) {
                return true;
            }
        return false;
        }
	
	public boolean leggTil(Innlegg innlegg) {
        if(!finnes(innlegg) && ledigPlass()) {
            innleggstabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        return false;
	}
    @Override
	public String toString() {
            String ut = nesteledig + "\n";

            for (int i = 0; i < nesteledig; i++) {
                ut += innleggstabell[i].toString();
            }
            return ut;
        }

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}