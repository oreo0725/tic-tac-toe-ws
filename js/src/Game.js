
function Game() {
    this.gameName = "tic-tac-toe";
}

Game.prototype.getName = function() {
    return this.gameName;
};

module.exports = Game;