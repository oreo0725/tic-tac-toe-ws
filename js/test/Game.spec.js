var expect = require('expect.js');
var Game = require('../src/Game');

describe('Example Test', function () {
  it('This test should pass', function () {
    expect(1+2).to.equal(3);
  });

  it('Array equal would use `eql`', function () {
    var arr = ['O', '.', '.'];
    arr[1] = 'X';
    expect(arr).to.eql(['O', 'X', '.']);
    expect(arr).to.not.eql(['O', '.', '.']);
    expect(arr).to.not.eql(['.', 'X', 'O']);
  });
});


describe('This is a tic-tac-toe game', function() {

    var game = new Game();

    it('Game name is `tic-tac-toe`', function () {
        expect(game.getName()).to.equal('tic-tac-toe');
    });

});
