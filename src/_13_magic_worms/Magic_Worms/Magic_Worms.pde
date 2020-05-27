
void draw() {
  makeMagical();
  for(int i = 0; i <300; i++) {
  
    ellipse(getWormX(i), getWormY(i), 15, 15);
    fill(255,0,99);
  }
}

void setup() {
      size(1000, 1000);
    background(#000000, #000000, #000000);
}

    float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
