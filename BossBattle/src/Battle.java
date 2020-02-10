import java.util.Random;
import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		// Variables for Boss
		String boss = "Mayor Maldad";
		int bossMaxDamage = 85;
		int bossDarkDmg = 85;
		int bossD = 0;
		int bossDifferentAttackChance = 50;
		int bossSuperDamage = 100;
		int bossGuardDamage = 20;
		
		// Variables for the Player
		int health = 175;
		int attackDamage = 55;
		int magicDamage =  30;
		int superDamage =  200;
		int steakAmount = 3;
		int steakHeals = 80;
		int burnChance = 50;
		int burnDmg = 30;
		
		//Ask for players name
		System.out.println("What is your name?");
		
		String player = reader.nextLine();
		
		//Introduction
		System.out.println("\tGrass is moving.... the wind is blowing... and then fear strikes your spine..\n");
		
		System.out.println("\t A shadowy but huge figure appears....Sweat rolls down your face..... you roll up your sleeves and buff up...\n");

		
		System.out.println("\tGet ready " + player +" this is your destiny..\n");
		
		//To keep loops working 
		boolean runs = true;
		
		boolean difficulty = true;
		
		
			while(runs) {
				
				//Difficulty section 1. for Normal gives the Boss the normal amount of HP, 2. Is supposed to increase the boss HP by 2x
				
				while(difficulty) {
				System.out.println("What is the difficulty you would like to play on?");
				
				System.out.println("\n1* for Normal \n2* for Hell");
				
				String input1 = reader.nextLine();
				
				
				
				if(input1.equals("1")) {
					
					bossD = 350;
					
					System.out.println(boss + " yells!!");
					break;
					
				} else if(input1.equals("2")) {
					
					bossD = 675;
					
					System.out.println(boss + " SCREAMS!!!!!!!");
					
					break;
					
				}else {
					
					System.out.println("\nINVALID!");
				}
				}
				
				
				System.out.println("***************************************************");
				
				System.out.println("\t* " + boss + " braces for battle.* \n");
				
				int bossHealth = bossD;
				
				//The game begins.
		
				while (bossHealth > 0) {
					System.out.println("\t" + player + " HP: " + health);
					System.out.println("\t" + boss + " HP: " + bossHealth);
					System.out.println("\n Whats your next move?");
					System.out.println("\t1* Slash! (Attack with basic slash)");
					System.out.println("\t2* Magic Attack: Fireball (Shoot a fireball from your arm!)");
					System.out.println("\t3* Gigaslash! (Attack with a megapowerful attack!) ");
					System.out.println("\t4* Eat some steak! (Recover 80 hp)");
					System.out.println("\t5* Guard!");
					
					
					String input = reader.nextLine();
					
					//Attack 1.
					
					if(input.equals("1")) {
						
						int attackDmgOnEnemy = rand.nextInt(attackDamage);
						
						int damageRecieved = rand.nextInt(bossMaxDamage);
						
						bossHealth -= attackDmgOnEnemy;
						
						health -= damageRecieved; 
						
						System.out.println("\t>> "+ player + " brandish your sword and go for a Slash! for " + attackDmgOnEnemy + " dmg!");
						
						System.out.println("\t>> " + boss + " yells and attacks for " + damageRecieved + " dmg!");
						
						if(health < 1) {
							System.out.println("\t>> You cant continue... you have been defeated... this is the end.");
							break;
							
						}
						
						if (bossHealth < 1) {
							System.out.println("\t>>" + player + " did it!! You won! " + boss + " has been defeated and you saved the world. ");
							System.out.println("\t>> Thank you for your courage, you saved the world!!!!");
							System.out.println("t>> Behind him opened a cave filled with millions of treasure chest, the sky returned blue");
							break;
						}
						
						// Attack 2.
						
					} else if(input.equals("2")) {
						
						int magicDmgOnEnemy = rand.nextInt(magicDamage);
						int magicDmgRecieved = rand.nextInt(bossDarkDmg);
						int burnMaybe = rand.nextInt(burnDmg);
						
						bossHealth -= magicDmgOnEnemy;
						
						health -= magicDmgRecieved;
			
					System.out.println("\t>> "+ player + " right arm flares up you feel the sparks and you blast a Fireball! for " + magicDmgOnEnemy + " dmg!");
					System.out.println("\t>> "+ boss + " cheeks puff up as it barfs Black foul balls of Evil at you for " + magicDmgRecieved + " dmg!");
					
					if(rand.nextInt(100) < bossDifferentAttackChance) {
						
						int damageRecieved1 = rand.nextInt(bossMaxDamage);
						
						health -= damageRecieved1;
						
						System.out.println("\t>> "+ boss + " ran in and RAMMED YOU!!! for " + damageRecieved1 + " dmg!");
					}
					
					if(rand.nextInt(100) < burnChance) {
						
						bossHealth -= burnMaybe;
						System.out.println("\t>> " + boss + " was burned from the fireball giving you extra DMG!! of " + burnMaybe + ", nice!");
					}
						
					if(health < 1) {
						
					
						System.out.println("\t>> You cant continue... you have been defeated... this is the end.");
						
						break;
					}
					
					if (bossHealth < 1) {
						System.out.println("\t>>" + player + " did it!! You won! " + boss + " has been defeated and you saved the world. ");
						System.out.println("\t>> Thank you for your courage, you saved the world!!!!");
						System.out.println("t>> Behind him opened a cave filled with millions of treasure chest, the sky returned blue");
						break;
					}
					
					//Attack 3.
					
					} else if(input.equals("3")) {
					
						int gigaSlash = rand.nextInt(superDamage);
						
						int damageRecieved2 = rand.nextInt(bossSuperDamage);
						
						bossHealth -= gigaSlash;
						health -= damageRecieved2;
						
						System.out.println("t>> " + player + " shined his swords towards the sky called on lighting, spun and did a Gigaslash!! for " + gigaSlash + " damage!! Wow!");
						System.out.println("t>> " + boss + " took this oppurtunity while " + player + " is recovering from his Gigaslash to hit for " + damageRecieved2 + " please be careful!");
						
						if(rand.nextInt(100) < bossDifferentAttackChance) {
							
							System.out.println("\t>> "+ boss + " just stood there..... and watched you..");
						
							
						}
						
						if (bossHealth < 1) 
						{
							System.out.println("\t>>" + player + " did it!! You won! " + boss + " has been defeated and you saved the world. ");
							System.out.println("\t>> Thank you for your courage, you saved the world!!!!");
							System.out.println("t>> Behind him opened a cave filled with millions of treasure chest, the sky returned blue");
							break;
							
						}
						//Attack 4.

					} else if(input.equals("4")) {
						
						if(steakAmount > 0) {
							health += steakHeals;
							steakAmount--;
							System.out.println("\t>*" + player + " whipped out a delicious Well Done Steak and ate it recovering " + steakHeals + " health. ");
							System.out.println("\t>*" + player + " has " + health + " now.");
							System.out.println("\t>*" + player + " has " + steakAmount + " remaining.");
							
						}
						
							if(health < 1) {
								
								
								System.out.println("\t>> You cant continue... you have been defeated... this is the end.");
								
								break;
							}
							
						
						//Attack 5
							
							
						
					} else if(input.equals("5")) {
						
						int guardDamage = rand.nextInt(bossGuardDamage);
						
						health -= guardDamage;
						
						System.out.println("\t>> " + player + " put up his sword and guarded increasing defense!");
						System.out.println("\tt " + boss + " licked his claws and slashed you for only! " + guardDamage);
						
						
						if(health < 1) {
							
							
							System.out.println("\t>> You cant continue... you have been defeated... this is the end.");
							
							break;
							
						}
						
					
					} else {
						
						System.out.println("Invalid input!");
						
					}
					
				}
				
				if (bossHealth < 1) {
					System.out.println("\t>>" + player + " did it!! You won! " + boss + " has been defeated and you saved the world. ");
					System.out.println("\t>> Thank you for your courage, you saved the world!!!!");
					System.out.println("\t>> Behind him opened a cave filled with millions of treasure chest, the sky returned blue");
					break;
				}
				
				if (bossHealth < 1) {
					System.out.println("\t>>" + player + " did it!! You won! " + boss + " has been defeated and you saved the world. ");
					System.out.println("\t>> Thank you for your courage, you saved the world!!!!");
					System.out.println("\t>> Behind him opened a cave filled with millions of treasure chest, the sky returned blue");
					break;
				}
					
				if (health < 1) {
					
					System.out.println("\t>> You....... died.......");
					break;
				}
				
				
			}
			System.out.println("**************************************************************");
			System.out.println("**************************************************************");
			System.out.println("**************************************************************");
			System.out.println("***********  !!!!!!THANK YOU FOR PLAYING!!!!!! ***********************");
	}
	}

