let humanScore = 0;
let computerScore = 0;
let currentRoundNumber = 1;

// Write your code

const generateTarget = () => {
    return Math.floor(Math.random() * 10)
};

let compareGuesses = (humanGuess, computerGuess, targetNumber) => {

    let humanPoint = Math.abs(humanGuess - targetNumber);
    let computerPoint = Math.abs(computerGuess - targetNumber);

    if (humanPoint <= computerPoint) {
      return true; 
    } else {
      return false;
    }
  }

const updateScore = (win) => {
    if (win === 'human') {
      humanScore += 1;
    } else if (win === 'computer') {
      computerScore += 1;
    }
  }

  console.log(updateScore('human'));
